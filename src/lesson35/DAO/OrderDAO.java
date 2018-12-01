package lesson35.DAO;

import lesson35.util.WorkWithContent;
import lesson35.util.Validate;
import lesson35.model.Order;

import java.io.*;

/**
 * Created by Valik on 05.11.2018.
 */
public class OrderDAO {
    private static File fileOrder = new File("D:\\Programs\\YandexDisk\\Программач Java\\какие то файлы\\Order.txt");

    public void writeOrder(Order order) throws Exception {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileOrder, true))) {
            writer.write(String.valueOf(order.getId()) + ", " + order.getUser() + ", " + order.getRoom() + ", " + WorkWithContent.dateToStr(order.getDateFrom()) + ", " + WorkWithContent.dateToStr(order.getDateTo()) + ", " + order.getMoneyPaid() + "\n");
        } catch (IOException e) {
            System.err.println("Order " + order.getId() + " can't write to file");
        }

    }

    public StringBuffer readOrder() throws Exception {
        return WorkWithContent.readFile(fileOrder);
    }

    public void cleaningFile() throws Exception {
        WorkWithContent.cleaningFile(fileOrder);
    }

    static {
        try {
            Validate.validateFileRead(fileOrder);
            Validate.validateFileWrite(fileOrder);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
