public class Watersort{
	
	static Character red = new Character('r');
	static Character green = new Character('g');
	static Character blue = new Character('b');
		
	public static void main(String[] args) {
		Integer top = null;
		StackAsMyArrayList<Character> bottel1 = new StackAsMyArrayList<Character>();
		StackAsMyArrayList<Character> bottel2 = new StackAsMyArrayList<Character>();
		StackAsMyArrayList<Character> bottel3 = new StackAsMyArrayList<Character>();
		StackAsMyArrayList<Character> bottel4 = new StackAsMyArrayList<Character>();
		StackAsMyArrayList<Character> bottel5 = new StackAsMyArrayList<Character>();
		
		//int[][] Bottels = {bottel1,bottel2,bottel3,bottel4,bottel5};
		
		System.out.println("\nInitial list: ");
		System.out.println(bottel2 +"\n");
		
		bottel2.push(red);
		bottel2.push(green);
		bottel2.push(blue);
		
		System.out.println("\nbottel 2 list: ");
		System.out.println(bottel2 +"\n");
		System.out.println(bottel2.getStackSize());
		System.out.println(bottel2.getUniform());
		
		bottel3.push(red);
		bottel3.push(red);
		bottel3.push(red);
		
		System.out.println("\nbottel 3 list: ");
		System.out.println(bottel3 +"\n");
		System.out.println(bottel2.getStackSize());
		System.out.println(bottel2.getUniform());
		
	}
	
	/*public String ShowAll(){
		String result;
		for (int[] arr: Bottels) {
			result += ("Bottel" +arr.toString()+": [");
			for(Character n : arr)
			{
				result +=(n+",");
			}
			result +=("]");
			
		}
		return result.toString();
	}*/
}