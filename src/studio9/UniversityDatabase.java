package studio9;

import java.util.HashMap;
import java.util.Map;

import assignment7.Student;

public class UniversityDatabase {
	//TODO: Complete this class according to the studio instructions
	private final Map<String, Student> universityData;
	
	public UniversityDatabase() {
		this.universityData = new HashMap<String, Student>();
	}
	public void addStudent(String accountName, Student student) {
		// TODO
		universityData.put(accountName, student);
	}

	public int getStudentCount() {
		// TODO
		return universityData.size();
	}

	public String lookupFullName(String accountName) {
		// TODO: Complete according to studio instructions
		String fullName = "";
		if(universityData.get(accountName) != null) {
			fullName = universityData.get(accountName).getFullName();
			return fullName;
		}
		else {
			return null;
		}
	}

	public double getTotalBearBucks() {
		// TODO
		double result = 0;
		for(String key : universityData.keySet()) {
			result = result + universityData.get(key).getBearBucksBalance();
		}
		return result;
	}
}
