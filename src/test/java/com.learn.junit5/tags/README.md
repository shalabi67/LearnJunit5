#Junit 5 Tags
This allows you to run a specific set of test based on special tag. 
Using junit 5 you can use @Tag or @Tags to run test specific set of tests.

##on test
###@TAG
####this test belongs on assumption and unittests. it can run on any of these tags
@Tag("assumption")
@Tag("unittests")
public class AssumptionTests {

	@Test
	public void assume() {
		Assumptions.assumeTrue("aaa".equals("bbb"));
		System.out.println("YOU should not see me: This test will be canceled since the assumption failed.");
	}
	@Test
	public void assumePass() {
		Assumptions.assumeTrue("aaa".equals("aaa"));
		System.out.println("TYou should see me.");
	}

}

###@Tags
####same as having multiple tags
@Tags({@Tag("production"),@Tag("development"), @Tag("unittests")})
public class ExceptionsTests {
	Person person;
	@BeforeEach
	public void setup() {
		person = new Person("", "", "", false);
	}


	@Test
	public void test() {
		Assertions.assertThrows(SomeException.class, () -> person.hasError());
	}
}


## Running using maven
This will have much effect with maven profiles.
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>${mavenPlugin}</version>
    <configuration>
        <groups>assumption</groups>
    </configuration>
</plugin>