package cn.abel.handler;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpPostExample {
    public static void main(String[] args) {
        HttpPostExample example = new HttpPostExample();
        String url = "https://open.douyin.com/api/apps/trade/v2/refund/create_refund";
        String json = "{\"out_order_no\": \"123123131\",\"out_refund_no\": \"123123\",\"cp_extra\": \"extra_info\",\"order_entry_schema\": {\"path\": \"page/xxx\",\"params\": \"{\\\"id\\\":1}\"},\"notify_url\": \"https://xxx\",\"item_order_detail\": [{\"item_order_id\": \"xxx\",\"refund_amount\": 100}]}";
        String token = "clt.xxx";
        try {
            String response = example.post(url, json, token);
            System.out.println("------------->>>> "+response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String post(String url, String json, String token) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        StringEntity entity = new StringEntity(json, ContentType.APPLICATION_JSON);
        httpPost.setEntity(entity);
        httpPost.addHeader("access-token", token);
        CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
        HttpEntity httpEntity = httpResponse.getEntity();
        String response = EntityUtils.toString(httpEntity);
        httpResponse.close();
        httpClient.close();
        return response;
    }
}