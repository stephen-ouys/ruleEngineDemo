package cn.stephen.demo.model.entity;

import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;

/**
 * <p>
 * 字典接口
 * </p>
 *
 * @author ouyangsheng
 * @date 2021-03-24
 */
public interface Dictionary<C extends Serializable, N>  {
    /**
     * 获取字典编码
     *
     * @return
     */
    @JsonValue
    C getCode();

    /**
     * 获取字典名称
     *
     * @return
     */
    N getName();

    /**
     * 实现MyBatis-Plus 枚举实现
     *
     * @return
     */
    default C getValue() {
        return getCode();
    }
}
