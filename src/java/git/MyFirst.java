package java.git;
/**
 * 
 * @author Mizanur Rahman
 *
 */
public class MyFirst {
	String firstGit;
	String update;
	boolean working; 
	boolean hasChild;
	
	public boolean isWorking() {
		return working;
	}
	
	public boolean isHasChild() {
		return hasChild;
	}

	public void setHasChild(boolean hasChild) {
		this.hasChild = hasChild;
	}

	public void setWorking(boolean works) {
		this.working = works;
	}
	public String getUpdate() {
		return update;
	}
	public void setUpdate(String update) {
		this.update = update;
	}
	public MyFirst(){}
	public String getFirstGit() {
		return firstGit;
	}
	public void setFirstGit(String firstGit) {
		this.firstGit = firstGit;
	}
	
}
