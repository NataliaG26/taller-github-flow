import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 */

/**
 * @author Natalia Gonzalez
 *
 */
public class Result {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int arCount = Integer.parseInt(bufferedReader.readLine().trim());
			
			List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						 .map(Integer::parseInt)
						 .collect(Collectors.toList());
				int result = Result.simpleArraySum(ar);
				bufferedWriter.write(String.valueOf(result));

				bufferedWriter.newLine();
				bufferedReader.close();
				bufferedWriter.close();
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
		}
		
	}
	
	public static int simpleArraySum(List<Integer> ar) {
		int result = 0;
		for (int i = 0; i < ar.size(); i++) {
			result += ar.get(i);
		}
		return result;
	}


}
