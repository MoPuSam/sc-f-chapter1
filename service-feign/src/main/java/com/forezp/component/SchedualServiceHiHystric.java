package com.forezp.component;

import com.forezp.intf.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * 断路器返回信息实现类
 * Created by admin on 2020/8/25.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
