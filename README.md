The user interface was created using the java.swing and java.awt packages: 
main menu, panels: functional toolbar, left panel and right panel with various information output to the user. 
Implemented a currency exchange rate parser with accounts recalculation depending on the selected currency.
Reading data is performed from a file with an arbitrary extension used by the file ini settings. 
Third-party libraries are used for working with ini files and graphical statistics output. 
The program is written for Windows desktops. 
All additional libraries are in a separate folder. 
Intellij IDEA IDE was used during development process with Maven project Builder.
Of course, programm has a lot of bugs, so it's neverending coding process...

Used Java packages:
javax.swing
java.awt
java.io
java.text
javax.xml.bind.annotation
javax.xml.bind.JAXBContext
javax.xml.bind.JAXBException
javax.xml.bind.Marshaller
javax.xml.bind.Unmarshaller
javax.xml.parsers.DocumentBuilderFactory
java.net.URL
java.util.ArrayList
java.util.Array
java.util.List
java.util.HashMap
java.util.Map
java.util.Comparator
java.text.SimpleDateFormat
java.util.Date
java.util.Objects;
java.time.YearMonth;
java.util.Calendar;
java.util.GregorianCalendar;

Working with ini files:
org.ini4j

Creating Chart Tables: 
org.jfree.chart.ChartFactory;
org.jfree.chart.ChartPanel;
org.jfree.chart.JFreeChart;
org.jfree.chart.labels.StandardPieToolTipGenerator;
org.jfree.chart.plot.PiePlot;
org.jfree.data.general.DefaultPieDataset;

Creating functionality for date selection:
org.jdatepicker.impl.DateComponentFormatter;
org.jdatepicker.impl.JDatePanelImpl;
org.jdatepicker.impl.JDatePickerImpl;
org.jdatepicker.impl.UtilDateModel;
