import java.util.*;

public class Path {
	public String name;
	public Path parent;
	public List<Path> children;
	
	public Path(String inName) {
		name = inName;
		children = new Vector<Path>();
	}
	
	public Path(String inName, Path inParent){
		name = inName;
		parent = inParent;
		children = new Vector<Path>();
	}
	
	public void AddChild(Path child){
		children.add(child);
	}
			
}
