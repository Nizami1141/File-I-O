<h1> Assignment 2 </h1>
<h3> Creating a simple JAVA application to implement File I/O and Filtration </h3>

Dear students,

In this assignment, you need to submit you work to implement File I/O and Filtration.

<h3>Task Related - List of the required types</h3>
<ul>
    <li>Mall class</li>
</ul>

<h3>Task Related - Mall class <strong>(10 %)</strong></h3>
<p>It should have the following fields and the methods:</p>
<p>Fields:</p>
<ul>
    <li><strong><em>id</em></strong> - (String - randomly generated)</li>
    <li><strong><em>mallName</em></strong> - (String)</li>
    <li><strong><em>country</em></strong> - (String)</li>
    <li><strong><em>city</em></strong> - (String)</li>
    <li><strong><em>yearOpened</em></strong> - (Integer)</li>
    <li><strong><em>gla_sqft</em></strong> - (Integer - Gross Leasable area in square feets)</li>
    <li><strong><em>gla_sqmt</em></strong> - (Integer - Gross Leasable area in square meters)</li>
    <li><strong><em>shops</em></strong> - (Integer)</li>
</ul>
<p>Methods:</p>
<ul>
    <li>necessary constructor(s)</li>
    <li>a getter method for each field</li>
    <li><strong><em>static parseFrom(String mallRecord) : Mall</em></strong> - parses the given string
        (comma-separated) to create an instance of Mall and returns it. Note that GLA is a string in the file and stores
        two information. These should be separately stored in the entity in relevant fields.</li>
    <li><strong><em>parseTo() : String</em></strong> - parses the current mall instance to a string record
        (comma-separated) to be later stored in a file. Note that the generated string should look like the records in
        the input source file in a way that there is only one column representing GLA (together both in sqft and sqm)
    </li>
    <li><strong><em>static parseTo(Mall mallInstance) : String</em></strong> - parses the given mall instance
        to a string record (comma-separated) to be later stored in a file. Hint: You should use already defined instance
        method to delegate the job</li>
    </li>
</ul>

<h3>Task Related - FileManager class <strong>(30 %)</strong></h3>
<p>It should have the following fields and the methods:</p>
<p>Fields:</p>
<ul>
    <li><strong><em>static final MALLS</em></strong> - (List)</li>
</ul>
<p>Methods:</p>
<ul>
    <li><strong><em>static loadMalls()</em></strong> - returns a list of malls reading the original data source
    </li>
    <li><strong><em>static saveMalls(List<Mall> malls, String fileName)</em></strong> - generates a file with
        the given filename (under the data folder) and stores the list of malls in the file. (You should
        include column names or header in the file)</li>
    <li>Any additional methods that would help you complete the task can be added.</li>
</ul>

<h3>Task Related - Exception handling <strong>(10 %)</strong></h3>
<ul>
    <li>Please, carefully follow the instructions above.</li>
    <li>Your program should properly enforce encapsulation, file i/o, collections, and streams</li>
    <li>Your program should prevent invalid operations using proper exceptions and exception handling. Some of them are
        the following:
        <ul>
            <li>specified file is not found</li>
            <li>given string cannot be parsed to a mall instance</li>
            <li>attempt to overwrite an existing file</li>
            <li>etc.</li>
        </ul>
    </li>
</ul>

<h3>Task Related - Testing all together <strong>(50 %)</strong></h3>
You will need to define a <strong><em>MallsDemo</em></strong> class which demonstrates all the functionality of
your program. However, it is strongly encouraged to test each class and each method as soon as they are completed to
have less errors and easy debugging in the end. <br />
When you compile, make sure your .class files are totally isolated from the rest and are <strong>never commited and
    pushed</strong>.
<h4>Queries (to be executed in MallsDemo):</h4>
<ul>
    <li>Load all the malls from <strong><i>Largest-Malls.csv</i></strong></li>
    <li>
        Sorting:
        <ul>
            <li><strong>(10 %)</strong>Define a method sort(List<Mall> malls, String fieldName, String order)
                    method to sort the list of all malls based on the given field and order</li>
            <li>Call the sort method to sort all malls based on the country names (first) and city names (second)</li>
            <li>Save the result in a .csv file (name the file as descriptive as possible)<strong>(5 %)</strong></li>
            <li>Call the sort method again to sort all malls based on the descending order of the number of shops</li>
            <li>Save the result in a .csv file (name the file as descriptive as possible)<strong>(5 %)</strong></li>
        </ul>
    </li>
    <li>
        Filtration:
        <ul>
            <li><strong>(10 %)</strong>Define a method filterByCountry(List<Mall> malls, String countryName)
                    method to select only those malls that are in the given country</li>
            <li>Call the filterByCountry method to find the info about malls in China</li>
            <li>Save the result in a .csv file (name the file as descriptive as possible)<strong>(5 %)</strong></li>
            <li><strong>(10 %)</strong>Define a method filterByAreaSqFt(List<Mall> malls, Integer lower, Integer
                    upper) method to select those malls whose GLA in square feets falls in the given range </li>
            <li>Call the filterByAreaSqFt method to find the info about malls whose GLA in square feet is in the range
                of [4,000,000;6,000,000] </li>
            <li>Save the result in a .csv file (name the file as descriptive as possible)<strong>(5 %)</strong>
            </li>
        </ul>
    </li>
    <li>Note: in case of an invalid field name, country name, throw a meaningful exception instance and handle it back
        in main</li>
</ul>

<h3>Task Related - Class diagrams <strong>(5 %)</strong></h3>
Draw the class diagrams including all the classes and their associations. Add the image(s) to the project
folder so that they are submitted to the repository as well. You may use any tool to draw the diagrams. Make sure you
submit image format (.jpg or .png).

<h4> Submission related: (5%)</h4>
<ul>
    <li> Record a short video not exceeding 5 minutes to explain the code
        as well as the way users can interact with the end product
        <ul>Show:
            <li> main blocks of the code base</li>
            <li> each of the features mentioned above</li>
            <li> files that are generated (discuss either in a text editor or in an Excel sheet)</li>
        </ul>
    </li>
    <li> Upload the video to YouTube and share the link by adding it to your README.md file as the first line.</li>
    <li> Submissions without a video recording will not be graded.</li>
</ul>

<h4>Important notes:</h4>
- Codes that do not compile and run for any reason will <strong>not be graded</strong>. Test properly before you submit
your work.<br />
- Please, also refer to the course syllabus about the assignments. <br />
- Each completed feature must be commited and pushed <strong>works submitted in just one or two commits are not
    acceptable</strong>. <br />
- This assignment will give you <strong><em>10 %</em></strong> of the overall. <br />
