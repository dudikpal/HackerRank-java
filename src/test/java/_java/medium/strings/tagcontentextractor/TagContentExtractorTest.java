package _java.medium.strings.tagcontentextractor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TagContentExtractorTest {

    @Test
    void test() {
        String input = """
                <h1>Nayeem loves counseling</h1>
                <h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
                <Amee>safat codes like a ninja</amee>
                <SA premium>Imtiaz has a secret crush</SA premium>""";
        String expected = """
                Nayeem loves counseling
                Sanjay has no watch
                So wait for a while
                None
                Imtiaz has a secret crush""";
        assertEquals(expected, new TagContentExtractor().solution(input));
    }

    @Test
    void test2() {
        String input = """
                <h1>some</h1>                                
                <h1>had<h1>public</h1></h1>                                
                <h1>had<h1>public</h1515></h1>                                
                <h1><h1></h1></h1>                                
                <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<                                
                >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>                                
                <<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>                                
                <>hello</>                                
                <>hello</><h>dim</h>                                
                <>hello</><h>dim</h>>>>>""";
        String expected = """
                some                                
                public                                
                None                                
                None                                
                None                                
                None                                
                None                                
                None                                
                dim                                
                dim""";
        assertEquals(expected, new TagContentExtractor().solution(input));
    }

}