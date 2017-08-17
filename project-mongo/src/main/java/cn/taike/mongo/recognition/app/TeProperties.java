package cn.taike.mongo.recognition.app;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

/**
 * Created by huayandong on 17/8/14.
 */
@Data
@Component
@ConfigurationProperties(prefix = "ti.paper")
public class TeProperties {

    @NotNull
    private String recognitionUrl;
    @NotNull
    private String callbackUrl;
    @NotNull
    private String evaluationUrl;
    @NotNull
    private String evaluationUserName;
    @NotNull
    private String evaluationPassword;
}