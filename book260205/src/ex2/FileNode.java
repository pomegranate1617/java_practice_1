package ex2;

public class FileNode implements Comparable<FileNode>{
	//4
	private String name;//이름
	private boolean isDirectory;//디렉토리
	private long size;//크기
	
	@Override
	public int compareTo(FileNode o) {
		//디렉토리끼리
		if(isDirectory ==true) {
			return this.name.compareTo(o.name);
		}
		//파일끼리
		else {
			if(this.size != o.size) {
				Long.compare(this.size, o.size);
			}
			return this.name.compareTo(o.name);
		}
	}
}
