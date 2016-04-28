/*import com.epam.lab2.var3.Controller;
import com.epam.lab2.var3.Model;
import com.epam.lab2.var3.View;*/

import com.epam.lab2.var20.Controller;
import com.epam.lab2.var20.Model;
import com.epam.lab2.var20.View;


public class Main {

	public static void main(String[] args) {
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller(model, view);
		
		//Run
		controller.processUser();
	}

}
