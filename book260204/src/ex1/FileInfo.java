package ex1;

public class FileInfo implements Comparable<FileInfo>{
	//9
	private String fileName;
	private long size;
	
	@Override
	public int compareTo(FileInfo o) {
		if(this.size<o.size) return 1;
		else if(this.size == o.size) {
			return this.fileName.compareTo(o.fileName);
		}
		else return -1;
	}
}
