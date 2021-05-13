public class main {


        public static void main (String[]args){

            SetClass sc = new SetClass();
            sc.add("melo");
            sc.add("melo2");
            sc.remove ("");
            sc.find("");

            ListClass lc = new ListClass();
            lc.add("");
            lc.remove ("");
            lc.find("");

            MapClass mp = new MapClass();
            mp.add (0,"Melo");
            mp.add (1,"Limi");
            mp.delete ("");
            mp.find(1);

            CollectionClass cc = new CollectionClass();
            cc.add("");
            cc.remove ("");
            cc.find("");
        }


}
