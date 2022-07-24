package com.gjh.elasticsearchDemo;

import com.gjh.elasticsearchDemo.entity.Student;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

@SpringBootTest
class WorkSpaceApplicationTests {


    @Resource
    RestHighLevelClient restHighLevelClient;

    @Test
    void comparableTest() {

        Student[] students = new Student[5];
        students[0] = new Student("rose", 16);
        students[1] = new Student("jack", 18);
        students[2] = new Student("mark", 17);
        students[3] = new Student("john", 16);
        students[4] = new Student("lily", 17);


        Arrays.sort(students);


        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }



        IndexRequest indexRequest = new IndexRequest("test123").id("122").source(Collections.singletonMap("country", "中国"));

        try {
            restHighLevelClient.index(indexRequest, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
