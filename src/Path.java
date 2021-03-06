import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Path implements TreeNode{
	public String name;
	public Path parent;
	public List<Path> children;
	public List<Resource> resourceList;
	
	public Path(String inName) {
		name = inName;
		children = new ArrayList<Path>();
		resourceList = new ArrayList<Resource>();
		Double tempDoub = Math.random() * 10;
		Integer tempInt = tempDoub.intValue() + 1;
		resourceList.add(new Resource("Seconds",tempInt));
		
		if (Math.random() > .5D) {
			tempDoub = Math.random() * 100;
			tempInt = tempDoub.intValue();
			resourceList.add(new Resource("Rupee",tempInt));
		}
	}
	
	public Path(String inName, Path inParent){
		name = inName;
		parent = inParent;
		children = new ArrayList<Path>();
		resourceList = new ArrayList<Resource>();
		Double tempDoub = Math.random() * 10;
		Integer tempInt = tempDoub.intValue() + 1;
		resourceList.add(new Resource("Seconds",tempInt));
		
		if (Math.random() > .5D) {
			tempDoub = Math.random() * 100;
			tempInt = tempDoub.intValue();
			resourceList.add(new Resource("Rupee",tempInt));
		}
	}
	
	public void AddChild(Path inPath) {
		children.add(inPath);
	}
	
	public void AddResource(Resource inResource) {
		resourceList.add(inResource);
	}
	
	@Override public String toString() {
		return name;
	}
	
	//Implementation
	public Enumeration<Path> children() {
		return java.util.Collections.enumeration(children);
	}
	
	//Implementation
	public boolean getAllowsChildren() {
		return true;
	}
	
	//Implementation
	public int getChildCount(){
		return children.size();
	}

	//Implementation
	public Path getChildAt(int i){
		return children.get(i);
	}
	
	//Implementation
	public Path getParent() {
		return parent;
	}
	
	//Implementation
	public int getIndex(TreeNode inPath) {
		return children.indexOf(inPath);
	}
	
	//Implementation
	public boolean isLeaf() {
		if (children.size() == 0)		
			return true;
		return false;
	}
}