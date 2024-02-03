package practice.pr.Factory;

public class FactoryMain1 {

	public static void main(String[] args) {
		
SamsungFactory[] samsungFactory = new SamsungFactory[6];

samsungFactory[0] = new SamsungFactory(1);
samsungFactory[1] = new SamsungFactory(2);
samsungFactory[2] = new SamsungFactory(3);
samsungFactory[3] = new SamsungFactory(4);
samsungFactory[4] = new SamsungFactory(5);
samsungFactory[5] = new SamsungFactory(6);

LGFactory[] lgFactory = new LGFactory[6];
lgFactory[0] = new LGFactory(1);
lgFactory[1] = new LGFactory(2);
lgFactory[2] = new LGFactory(3);
lgFactory[3] = new LGFactory(4);
lgFactory[4] = new LGFactory(5);
lgFactory[5] = new LGFactory(6);

for(int i = 0; i < samsungFactory.length; i++) {
	samsungFactory[i].start();
	samsungFactory[i].produceSmartPhone();
	samsungFactory[i].stop();
	
}

System.out.println();
for(int i = 0; i < lgFactory.length; i++) {
	lgFactory[i].start();
	lgFactory[i].produceSmartTV();
	lgFactory[i].stop();
}
	}

}
