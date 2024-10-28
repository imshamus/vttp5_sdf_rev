package CSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main 
{
    public static void main(String[] args) throws IOException 
    {
        Path p = Paths.get("src/CSV/EmployeeDetails.csv");
        File f = p.toFile();

        List<Employee> employee = new ArrayList<>();
        // Employee a = new Employee("a", "m", 1000);
        // employee.add(a);
        // employee.add(new Employee("x", "m", 1000));
        // employee.add(new Employee("y", "f", 1000));

        // System.out.println(employee);

        Reader reader = new FileReader(f);
        BufferedReader br = new BufferedReader(reader);

        String line = "";

        while (line != null)
        {   
            // Read a line
            line = br.readLine();

            // If line is null, we reached EOF
            if (line == null)
            {
                break;
            }

            if (line.startsWith("Name"))
            {
                continue; // skip that line
            }

            String[] tempList = line.split(",");
            String name = tempList[0];
            String gender = tempList[1];
            int salary = Integer.parseInt(tempList[2]);

            employee.add(new Employee(name,gender,salary));
        }

        br.close();
        reader.close();

        System.out.println(employee);

    }
}
