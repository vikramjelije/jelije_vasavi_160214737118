import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	int length;
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
		this.length=length;
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students==null) throw new IllegalArgumentException(); 
		else{this.students=students;}
	
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if((index<0)||(index>this.length)) throw new IllegalArgumentException();
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if((index<0)||(index>=this.length)||(student==null)) throw new IllegalArgumentException();
		else
		{
			students[index]=student;
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null) throw new IllegalArgumentException();
		else
		{
			Student[] studentsone=new Student[length+1];
			studentsone[0]=student;
			for(int i=1;i<(length+1);i++)
				studentsone[i]=students[i-1];
			students=studentsone;
			this.length=this.length+1;
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null) throw new IllegalArgumentException();
		else
		{
			Student[] studentsone=new Student[length+1];
			studentsone[length]=student;
			for(int i=0;i<length;i++)
				studentsone[i]=students[i-1];
			students=studentsone;
			this.length=this.length+1;
		}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		int i;
		Student[] studentsone=new Student[length+1];
		for(i=0;i<index;i++)
			studentsone[i]=students[i];
		studentsone[i++]=student;
		for(;i<(length+1);i++)
			studentsone[i]=students[i-1];
		students=studentsone;
		this.length=this.length+1;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if((index<0)||(index>=this.length)) throw new IllegalArgumentException();
		Student[] studentsone=new Student[length-1];
		for(int i=0,j=0;i<length;i++)
		{
			if(i==index) continue;
			else
			{
				studentsone[j]=students[i];
				j++;
			}
		}
		students=studentsone;
		this.length=this.length-1;
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(student==null) throw new IllegalArgumentException();
		int flag=0,index=0;
		for(int i=0;i<length;i++){
			if((students[i].compareTo(student))>0)
			{
				flag=1;
				index=i;
				break;
			}
		}
		if(flag==1)
		{
			int i,j;
			Student[] studentsone=new Student[length-1];
			for(i=0,j=0;i<length;i++)
		{
			if(i==index) continue;
			else
			{
				studentsone[j]=students[i];
				j++;
			}
		}
		students=studentsone;
		this.length=this.length-1;
		}
		else throw new IllegalArgumentException("Student not exist");
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if((index<0)||(index>=this.length)) throw new IllegalArgumentException();
		else{
			Student[] studentsone=new Student[index+1];
			for(int i=0;i<index+1;i++)
				studentsone[i]=students[i];
			students=studentsone;
			this.length=index;
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		int index=0;
		if(student == null) throw new IllegalArgumentException();
		
		else{
			int flag=0;
			for(int i=0;i<length;i++)
			{
				if((student.compareTo(students[i]))>0)
				{
					index=i;
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				Student[] studentsone=new Student[index+1];
				for(int i=0;i<index+1;i++)
				studentsone[i]=students[i];
			students=studentsone;
			this.length=index;
			}
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if((index<0)||(index>=this.length)) throw new IllegalArgumentException();
		else{
			Student[] studentsone=new Student[length-index];
			for(int i=index,j=0;i<length;i++,j++)
				studentsone[j]=students[i];
			students=studentsone;
			this.length=length-index;
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		int index=0;
		if(student == null) throw new IllegalArgumentException();
		
		else
		{
			int flag=0;
			for(int i=0;i<length;i++)
			{
				if((student.compareTo(students[i]))>0)
				{
					index=i;
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				Student[] studentsone=new Student[length-index];
				for(int i=index,j=0;i<length;i++,j++)
				studentsone[j]=students[i];
			students=studentsone;
			this.length=length-index;
			}
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		int i;
		if(student== null) throw new IllegalArgumentException();
		else{
			for(i=0;i<length;i++)
				if((student.compareTo(students[i]))>0)
					break;
		}
		return students[i];
	}
}
