package ex2;

public class Version implements Comparable<Version>{
	//5
	private String version;
	
	@Override
	public int compareTo(Version o) {
		String[] arr=this.version.split(".");
		String[] arr2=o.version.split(".");
		if(Integer.parseInt(arr[0])<Integer.parseInt(arr2[0])) {
			return -1;
		}
		else if(Integer.parseInt(arr[0])== Integer.parseInt(arr2[0])) {
			if(Integer.parseInt(arr[1])<Integer.parseInt(arr2[1])) {
				return -1;
			}
			else if(Integer.parseInt(arr[1]) == Integer.parseInt(arr2[1])) {
				return 0;
			}
			else return 1;
		}
		else return 1;
	}
}
