package com.theironyard.charlotte.demo.services;

import com.theironyard.charlotte.demo.models.NASAData;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by BUBBABAIRD on 5/22/17.
 */
@Service
public class NASAService {
    RestTemplate template;

    public NASAService (RestTemplate template) {
        this.template = template;
    }
    public NASAData getData(String q) {

        // NASA requires us to use http headers to
        // authorize our requests. we'll put them here.
        HttpHeaders headers = new HttpHeaders();

        // the headers are basically a HashMap<String, List<String>>.
        // so, we need to put our (one) value in a list in order to use it.
//        List<String> authheaders = new ArrayList<>();
//
//        authheaders.add("Client-ID tEjtW6bgbuadDHSxhtRo9SF3ZcB8FoW3N3tRUXZC");

        // the Authorization header is used by many servers to authorize
        // users.
//        headers.put("Authorization", authheaders);

        // an "HttpEntity" is a representation of our request object. many
        // times we will need to use this entity to send data to the server.
        // in this case, we just need it basically to send the headers.
//        HttpEntity<NASAData> data = new HttpEntity<>(new NASAData(), headers);

        // Map is the interface
        Map<String, Object> uriVars = new HashMap<>();

        uriVars.put("search",q);
        // /search?q={q}

        // we issue our request to the NASA API and parse the response into a `NASAData`
        // object.
        HttpEntity<NASAData> response = template.exchange("https://images-api.nasa.gov/search?q={search}", HttpMethod.GET, null, NASAData.class, uriVars);

        return response.getBody();
    }
}
