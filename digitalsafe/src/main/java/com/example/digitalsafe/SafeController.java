package com.example.digitalsafe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/safe")
public class SafeController {

    // สร้าง DigitalSafe ล่วงหน้า (สมมติชื่อเจ้าของเป็น Rew)
    private DigitalSafe digitalSafe = new DigitalSafe("Rew");

    // GET /safe/owner : ตอบกลับชื่อเจ้าของตู้เซฟ
    @GetMapping("/owner")
    public String getOwner() {
        return "Owner = " + digitalSafe.getOwnerName();
    }

    // GET /safe/balance : ตอบกลับยอดเงินปัจจุบัน
    @GetMapping("/balance")
    public String getBalance() {
        return "Current balance = " + digitalSafe.getBalance();
    }

    // POST /safe/deposit : รับ amount มาฝาก และตอบกลับยอดเงินใหม่
    @PostMapping("/deposit")
    public String deposit(@RequestParam double amount) {
        digitalSafe.deposit(amount);
        return "New balance = " + digitalSafe.getBalance();
    }
}