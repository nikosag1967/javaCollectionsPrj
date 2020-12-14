package streams;

import java.util.*;
import java.util.stream.Collectors;

public class streamTest {

    public static void main(String[] args){
        // this is a comment
        //this is a second comment
        // this is comment 3

        List<Integer> numbers = Arrays.asList(100,15,9,2,30);
        List<Integer> lessThanTen = new ArrayList<Integer>();

        lessThanTen = numbers.stream().filter(n->n > 10).collect(Collectors.toList());

        System.out.println("numbers less than 10 :" + lessThanTen);

        List<Integer> powerOfTwo = numbers.stream().map(n->n*n).collect(Collectors.toList());
        System.out.println("numbers power of two :" + powerOfTwo);


        List<Integer> selectedPowerOfTwo = numbers.stream().filter(n->n>20).map(n->n*n).collect(Collectors.toList());
        System.out.println("selected numbers power of two :" + selectedPowerOfTwo);

        List<Integer> numbersAfterFilterMap = numbers.stream().filter(n->n>10).map(x->x*x).collect(Collectors.toList());


        System.out.println("min number after filter-map = "+Collections.min(numbers.stream().filter(n->n>10).map(x->x*x).collect(Collectors.toList())));
        System.out.println("max number after filter-map = "+Collections.max(numbers.stream().filter(n->n>10).map(x->x*x).collect(Collectors.toList())));




        List<Integer> ls1 = Arrays.asList(1,2,3);
        List<Integer> ls2 = Arrays.asList(4,5,6);
        List<Integer> ls3 = Arrays.asList(7,8,9);



        List<List<Integer>> finalList= Arrays.asList(ls1,ls2,ls3);
        System.out.println("FlatMap :"+finalList);

        List<Integer> finalResult =finalList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println("FlatMap :"+finalResult);


        Set<Integer> mySet = new HashSet<Integer>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        mySet.stream().map(x->x*2).collect(Collectors.toList());
        System.out.println("New mySet ="+mySet);
        Collections.max(mySet);


        List<Integer> finalResult1 =finalList.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
        System.out.println("FlatMap :"+finalResult1);

        class Student {
            String name;
            int sid;
            char grade;

             Student(String name, int sid, char grade) {
                this.name = name;
                this.sid = sid;
                this.grade = grade;
            }
        }

        List<Student> studentList1 = new ArrayList<Student>();

        studentList1.add(new Student("nikos",101,'A'));
        studentList1.add(new Student("soula",102,'B'));

        List<Student> studentList2 = new ArrayList<Student>();

        studentList1.add(new Student("alekos",104,'A'));
        studentList1.add(new Student("kostas",105,'B'));



        List<List<Student>> finalStudentList = Arrays.asList(studentList1,studentList2);

        List<String> studentNames = finalStudentList
                .stream()
                .flatMap(stl->stl.stream().map(x->x.name))
                .collect(Collectors.toList());

        System.out.println("names from the flatMaped studentList objects: "+studentNames);



        // distinct(), limit(), count()

        List<String> vehicleList = Arrays.asList("bus","car","bycle", "bus","car", "car","bike");

        // distinct() - remove duplicates
        vehicleList.stream().distinct().forEach(value->System.out.println(" distinct vehicle list: "+value));

        System.out.println("How many items? :"+vehicleList.stream().distinct().count());


        /* min() */
        Optional <Integer> minimum= ls1.stream().
                min((v1, v2) -> { return v1.compareTo(v2); });

        System.out.println("min value is:"+minimum);

        List<String> stringList = Arrays.asList("Anna","B","C","1","2","3");

        Optional <String> oneString= stringList.stream().reduce((v1,v2)-> v1+v2);
        System.out.println(stringList.stream().reduce("",(v1,v2)-> {return v1+v2;}));


        Object myAarr[] = stringList.stream().toArray();

        System.out.println("List as Array: "+myAarr);
    }



}
