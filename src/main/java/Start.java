
public class Start {

	public static void main(String[] args) {
		sweepNumbericRange("1,2,4-7,18-21");

	}

	public static void sweepNumbericRange(String line){
		String result = "";
		String[] numbers;
		String[] array = line.split(",");
		for (String one : array) {
			if (one.contains("-")){
				numbers = one.split("-");
				int first = Integer.parseInt(numbers[0]);
				int second = Integer.parseInt(numbers[1]);
				for (int i = first; i <= second; i++) {
					result = result + i + ",";
				}
			} else {
				result = result + one + ",";
			}
		}		
		System.out.println(line + " - " + result);
	}
}
