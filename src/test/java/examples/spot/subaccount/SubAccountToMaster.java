package examples.spot.subaccount;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class SubAccountToMaster {
    private SubAccountToMaster() {
    }
    private static final double amount = 0.01;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("asset", "USDT");
        parameters.put("amount", amount);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSubAccount().subAccountToMaster(parameters);
        System.out.println(result);
    }
}
