package arraylist;

import java.util.ArrayList;

public class mobile_main {
	 
	public static void main(String[] args) {
		
		ArrayList<mobile> mlist = new ArrayList<mobile>();
		
		mobile m1 = new mobile("Vivo","V50",34999,8);
		mobile m2 = new mobile("Realme","P3Pro",34999,8);
		mobile m3 = new mobile("Realme","8",15990,8);
		mobile m4 = new mobile("Samsung","14 pro plus",28017,8);
		mobile m5 = new mobile("OnePlus","13R",42990,12);
		mobile m6 = new mobile("Samsung","Galaxy S25 Ultra",141000,12);
		mobile m7 = new mobile("POCO","X7 Pro",25999,8);
		mobile m8 = new mobile("OnePlus","11R",31989,18);
		mobile m9 = new mobile("Oppo","A15",53899,3);
		mobile m10 = new mobile("Samsung","Galaxy A14 5G",8289,4);
		
		mlist.add(m1);
		mlist.add(m2);
		mlist.add(m3);
		mlist.add(m4);
		mlist.add(m5);
		mlist.add(m6);
		mlist.add(m7);
		mlist.add(m8);
		mlist.add(m9);
		mlist.add(m10);
		
		mobilelist.find_mobile_by_brand("Samsung", mlist);

        mobilelist.display_mobile_details(10000, 50000, mlist);

        mobilelist.display_mobile_details(6,mlist,30000);
	}		
}




