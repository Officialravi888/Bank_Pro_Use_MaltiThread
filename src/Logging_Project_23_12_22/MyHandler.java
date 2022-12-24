package Logging_Project_23_12_22;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;
public class MyHandler extends StreamHandler{

    @Override
    public void publish(LogRecord record) {
        //add own logic to publish
        super.publish(record);
    }

    public class MyFormatter extends Formatter {

        @Override
        public String format(LogRecord record) {
            return record.getThreadID()+"::"+record.getSourceClassName()+"::"
                    +record.getSourceMethodName()+"::"
                    +new Date(record.getMillis())+"::"
                    +record.getMessage()+"\n";
        }

    }



    @Override
    public void flush() {
        super.flush();
    }


    @Override
    public void close() throws SecurityException {
        super.close();
    }
}
