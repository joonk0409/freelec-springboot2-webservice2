package com.jojodu.book.springboot.dto;

import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트(){
        String name = "Test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        System.out.println("result >>>>"+assertThat(dto.getName()).isEqualTo(name));
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}