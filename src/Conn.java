import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Conn {

	public static void main(String[] args) {
		connEleServer();
	}
	public static void connEleServer() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = "";
		while (true) {
			try {
				time = sdf.format(new Date());
				URL url = new URL("http://j2187414f5.iask.in:53936/TPWebService.asmx");
				HttpURLConnection conn = (HttpURLConnection) url
						.openConnection();
				conn.setConnectTimeout(3000);
				conn.connect();
				if (conn.getResponseCode() == 200) {
					System.out.println("执行成功--" + time);
				} else {
					System.out.println("返回失败------" + time);
				}
				Thread.sleep(1000 * 60 * 3);
			} catch (Exception e) {
				System.out.println("异常失败------" + time);
				try {
					Thread.sleep(1000 * 60 * 5);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
	
}
