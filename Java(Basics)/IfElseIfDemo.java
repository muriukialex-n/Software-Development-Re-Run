public class IfElseIfDemo {
	public static void main (String[] args) {
		int testscore = 67;
		char grade;
		
		if (testscore >= 70 && testscore <= 100) {
			grade = 'A';
		}
		else if (testscore >= 60 && testscore <= 69) {
			grade = 'B';
		}
		else if (testscore >= 50 && testscore <= 59) {
			grade = 'C';
		}
		else if (testscore >=40 && testscore <= 49) {
			grade = 'D';
		}
		else if (testscore >= 0 && testscore <= 39) {
			grade = 'E';
		}
		else {
            grade = 'X'; // Default case for invalid scores
        }

        System.out.println("Grade: " + grade);
	}
}