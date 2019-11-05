package com.example.cxfclient;

import com.gisquest.jsyd.business.webservice.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.namespace.QName;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

@SpringBootTest
class CxfClientApplicationTests {

    private final static QName SERVICE_NAME = new QName("http://webservice.business.jsyd.gisquest.com/", "jsydzbService");
    @Test
    void contextLoads() {
        JsydzbService_Service jsydzbService_service = new JsydzbService_Service(JsydzbService_Service.WSDL_LOCATION, SERVICE_NAME);
        JsydzbService jsydzbService = jsydzbService_service.getJsydzbServiceImplPort();
        NzyDataVo nzyDataVo = new NzyDataVo();
        nzyDataVo.setGdMj(BigDecimal.valueOf(10.004420));
        String result = jsydzbService.tjNzy(nzyDataVo);
        System.out.println(result);
    }

    @Test
    void test2(){
        JsydzbService_Service jsydzbService_service = new JsydzbService_Service(JsydzbService_Service.WSDL_LOCATION, SERVICE_NAME);
        JsydzbService jsydzbService = jsydzbService_service.getJsydzbServiceImplPort();
        BpDataVo bpDataVo = new BpDataVo();
        String result = jsydzbService.xmZp(bpDataVo);
    }

}
