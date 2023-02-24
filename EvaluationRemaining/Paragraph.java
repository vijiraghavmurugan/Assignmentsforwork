package evaluation23feb2023;

public class Paragraph {

	public static void main(String[] args) {
		String para = "Philosophy of Education is a label applied to the study of the purpose, process, nature and ideals of education. It can be considered a branch of both philosophy and education.";

		String[] paraArray = para.split("\\.\\s|\\.|\\,\\s|\\s");

		// toPrint(paraArray);

		String finalOutput = paraArray[0] + " ";
		int count;

		for (int i = 1; i < paraArray.length - 1; i++) {
			count = 0;
			boolean isAvailable = false;
			int length = finalOutput.length() - 2;
			char last = finalOutput.toLowerCase().charAt(length);

			for (int j = i + 1; j < paraArray.length; j++) {
				if ((paraArray[j] != null) && (last == paraArray[j].toLowerCase().charAt(0))) {
					finalOutput += paraArray[j] + " ";
					paraArray[j] = null;
					isAvailable = true;
					count++;
					break;
				}

			}

			i = i - count;

			if ((!isAvailable) && (paraArray[i] != null)) {
				finalOutput += paraArray[i] + " ";
			}

		}
		System.out.println(finalOutput);

	}

}
