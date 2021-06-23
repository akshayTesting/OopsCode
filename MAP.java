import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MAP {
public static void main(String[] args)
{

	Map<String,Integer> map=new HashMap<>();
	map.put("hiren", 111);
	map.put("raj", 22);
	map.put("andy", 33);
	System.out.println(map.putIfAbsent("richard", 444));
}
}
