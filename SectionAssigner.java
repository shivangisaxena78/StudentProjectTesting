
package mypack;

import java.util.List;   
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SectionAssigner {

    public static List<Integer> assignSections(List<Integer> sections, int numStudents) {
        List<List<Integer>> sectionPermutations = new ArrayList<>();
        Random random = new Random();

        // Generate permutations of sections
        for (int i = 0; i < numStudents; i++) {
            List<Integer> shuffledSections = new ArrayList<>(sections);
            Collections.shuffle(shuffledSections);
            sectionPermutations.add(shuffledSections);
        }

        // Randomly select a section for each student
        List<Integer> sectionAllotments = new ArrayList<>();
        for (int i = 0; i < numStudents; i++) {
            List<Integer> studentSections = sectionPermutations.get(i);
            int studentSection = studentSections.get(random.nextInt(studentSections.size()));
            sectionAllotments.add(studentSection);
           System.out.println("Student 1 allotted section : "+studentSection);
        }

        return sectionAllotments;
    }

    public static void main(String[] args) {
        List<Integer> sections = new ArrayList<>();
        sections.add(121);
        sections.add(12);
        sections.add(13);
        sections.add(45);
        sections.add(67);
       
        int numStudents = 10;
        List<Integer> allotments = assignSections(sections, numStudents);
        System.out.println("Given sectionSize = " + allotments);
        
    }
}
