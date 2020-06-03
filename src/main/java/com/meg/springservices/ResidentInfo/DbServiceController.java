package com.meg.springservices.ResidentInfo;

import com.meg.springservices.ResidentInfo.api.ResidentRequest;
import com.meg.springservices.ResidentInfo.api.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@RestController("/dbService")
@Slf4j
@Validated
public class DbServiceController {

    @GetMapping("/getPerson")
    public String getAllPersons() {
        return "Hello World";
    }

    @PostMapping(value = "/createResident", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Response> createPerson(
            @RequestHeader("Source") @NotNull  String source,
            @RequestHeader("TraceId") @NotBlank String traceId,
            @RequestBody  @Valid ResidentRequest residentRequest) {

        log.info("Create resident Request Received: "+ residentRequest.toString());
        Response response = Response.builder()
                .message("Resident info created")
                .build();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
