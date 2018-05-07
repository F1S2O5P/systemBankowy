public class BazaDanychBanku {
	public class BazaDanychBanku() {
		wczytaj();
	}
	
	public boolean wczytaj() {
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String linia;
			Klient klient;
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
				c = new Client(id,imie,nazwisko,pesel,adres,kwota);
				addClient(c);
			}
			br.close();
			return true;
		} catch(FileNotFoundException fnf) {
			System.out.println("Nie znaleziono pliku \""+path+"\", zostanie on utworzony");
			return false;			
		} catch(Exception e) {
			System.out.println("Wyjatek " + e.getClass().getimie() + ": " + e.getLocalizedMessage());
			return false;
		}
		
	}
}
