public class BazaDanychBanku {
	public class BazaDanychBanku() {
		wczytaj();
	}
	
	private String escape(String s) {
		return s.replace(",", "\\,");
	}
	
	private String unescape(String s) {
		return s.replace("\\,", ",");
	}
	
	public List<Klient> wczytaj() {
		try {
			ArrayList<Klient> lista = new ArrayList<Klient>();
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String linia;
			Klient klient;
			private final String SEPARATOR = ",";
			while((linia = br.readLine()) != null) {
				String obecnaKolumna;
				
				int id;
				String imie,nazwisko,adres;
				String pesel;
				double kwota;
				String[] column = new String[6];
				int cur_delim = 0;
				int next_delim = 0;
				int temp_delim = 0;
				for(int i=0;i<6;i++) {
					if(i != 5) next_delim = line.indexOf(",", cur_delim);
					else next_delim = line.length();
					obecnaKolumna = line.substring(cur_delim, next_delim);
					while(obecnaKolumna.charAt(obecnaKolumna.length()-1) == '\\') {
						if(line.charAt(next_delim) == ',') {
							temp_delim = next_delim+1;
							next_delim = line.indexOf(",", temp_delim);
							obecnaKolumna = line.substring(cur_delim, next_delim);
						} else {
							break;
						}
					}
					column[i] = obecnaKolumna;
					cur_delim = next_delim+1;
				}
				id = Integer.parseInt(column[0]);
				imie = unescape(column[1]);
				nazwisko = unescape(column[2]);
				pesel = column[3];
				adres = unescape(column[4]);
				kwota = Double.parseDouble(column[5]);
				klient = new Klient(id,imie,nazwisko,pesel,adres,kwota);
				lista.add(klient);
			}
			br.close();
			return lista;
		} catch(FileNotFoundException fnf) {
			System.out.println("Nie znaleziono pliku \""+path+"\", zostanie on utworzony");
			return null;			
		} catch(Exception e) {
			System.out.println("Wyjatek " + e.getClass().getName() + ": " + e.getLocalizedMessage());
			return null;
		}
		
	}
	
	public boolean zapisz(List<Klient> klienci) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			PrintStream out = new PrintStream(fos);
			for(int i=0;i<klienci.size();i++) {
				Klient klient = klienci.get(i);
				out.println(c.getId()+SEPARATOR+escape(klient.getImie())+SEPARATOR+escape(klient.getNazwisko())+SEPARATOR+klient.getPesel()+SEPARATOR+escape(klient.getAdres())+SEPARATOR+klient.getStanKonta());
			}
			out.close();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
}
