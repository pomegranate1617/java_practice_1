package ex1;

public class Version implements Comparable<Version>{
	//소수점 자리를 제한 할 수 있었나...?;;;
	private String version;
	
	@Override
	public int compareTo(Version o) {
		//단위로 분리 필요....
		//"."안됨 이스케이프 문자 넣어서 \\.으로 처리해야 됨....<<Ai가 가르쳐줌..
		String[] arr=this.version.split("\\.");
		String[] arr2=o.version.split("\\.");
		//내가 푼 식
//		//첫번째 인자가 클 수록 뒤로 배치
//		//두번째 인자가클수록 뒤로 배치
//		int upPoint1=Integer.parseInt(arr[0]);
//		int upPoint2=Integer.parseInt(arr2[0]);
//		if(upPoint1 != upPoint2) {
//			return Integer.compare(upPoint1, upPoint2);
//		}
//		int downPoint1=Integer.parseInt(arr[1]);
//		int downPoint2=Integer.parseInt(arr2[1]);
//		return Integer.compare(downPoint1, downPoint2);
		//--------------------------------------
		//ai가 푼거
		int length=(int)Math.max(arr.length, arr2.length);
		for(int i=0;i<length;i++) {
			int v=i< arr.length ? Integer.parseInt(arr[i]) :0;
			int v2=i<arr2.length ? Integer.parseInt(arr2[i]) :0;
			if(v != v2) return Integer.compare(v, v2);
		}
		return 0;
	}
}
