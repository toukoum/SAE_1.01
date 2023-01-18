import java.util.ArrayList;

public class UtilitairePaireChaineEntier {


    public static int indicePourChaine(ArrayList<PaireChaineEntier> listePaires, String chaine) {
        //indice de chaine dans listePaires si chaine est présente et -1 sinon

        int i = 0;

        while (i < listePaires.size() && listePaires.get(i).getChaine().compareTo(chaine) != 0) {
            i++;
        }

        if (i < listePaires.size() && listePaires.get(i).getChaine().compareTo(chaine) == 0) {
            return i;
        }
        else {
            return -1;
        }
    }

    public static int entierPourChaineItt(ArrayList<PaireChaineEntier> listePaires, String chaine) {

        for (PaireChaineEntier paire : listePaires) {
            if (paire.getChaine().equals(chaine)) {
                return paire.getEntier();
            }
        }
        return 0;
    }

    public static int entierPourChaine(ArrayList<PaireChaineEntier> listePaires, String chaine) {
        int gauche = 0;
        int droite = listePaires.size() - 1;

        while (gauche <= droite) {
            int milieu = (gauche + droite) / 2;
            int compare = chaine.compareTo(listePaires.get(milieu).getChaine());

            if (compare == 0) {
                return listePaires.get(milieu).getEntier();
            } else if (compare < 0) {
                droite = milieu - 1;
            } else {
                gauche = milieu + 1;
            }
        }

        return 0;
    }




    public static String chaineMax(ArrayList<PaireChaineEntier> listePaires) {
        int ind_max = 0;
        for (int i = 1; i < listePaires.size(); i++) {
            if (listePaires.get(i).getEntier() > listePaires.get(ind_max).getEntier()) {
                ind_max = i;
            }
        }
        return listePaires.get(ind_max).getChaine();
    }


    public static float moyenne(ArrayList<Integer> liste_compteur) {
        int somme = 0;
        for (int i : liste_compteur) {
            somme += i;
        }
        return (float) somme / liste_compteur.size();
    }


}
//recherche ittérative => recherche dicho
