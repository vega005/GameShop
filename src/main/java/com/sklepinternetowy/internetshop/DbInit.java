package com.sklepinternetowy.internetshop;

import com.sklepinternetowy.internetshop.model.Item;
import com.sklepinternetowy.internetshop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.List;

@Configuration
public class DbInit implements CommandLineRunner {

    private final ItemRepository itemRepository;

    @Autowired
    public DbInit(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        itemRepository.saveAll(List.of(
                new Item("Red Dead Redemption 2", new BigDecimal("100.99"), Category.PLAYSTATION, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGkzASiWXzCMQLbPjvR5Kv5FHuK7NSNt3157fOmXRh&s.jpg"),
                new Item("Wiedźmin 3", new BigDecimal("82.99"), Category.PLAYSTATION,"https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcRjBKz4sl3ekd113FZfzoMwvyr7RT-rywZKuDAVdbkSK8B07UGh8L6eANcm6DiIySlT7Y3yflZga-ARsdIHW3K1AiMhNpuVWnIgJdpNJkG28y7xW0-I_MRy&usqp=CAc.jpg"),
                new Item("CyberPunk 2077", new BigDecimal("99.99"), Category.PLAYSTATION,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQh9LDEih97sMIbibY8h3u0ojqWfW0TtHc3TrSTLkkf&s.jpg"),
                new Item("Immortals Fenyx Rising", new BigDecimal("50.99"), Category.XBOX, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRJ2FjJywKV5SeHztYc7p0A6GehitKE2gNSWA&usqp=CAU.jpg"),
                new Item("Need for Speed", new BigDecimal("57.99"), Category.PC, "https://wirtus.pl/images/detailed/7/nfs-need-for-speed-2015-06-16-need-for-speed-2015-okladka.jpg"),
                new Item("Fallout 76", new BigDecimal("45.50"), Category.PLAYSTATION,"https://encrypted-tbn0.gstatic.com/shopping?q=tbn:ANd9GcT5_ErOFuvcfT4zcIgPr3GN-FTHLKtdfVy-vI5iNxPTmNH1qKsAVd-Hb_UI2VybY-yEIorsaguVsnnm1W69_nhqoppBQdotLRhMElc7xYercuAJ60TfGtHi&usqp=CAE.jpg"),
                new Item("Zenith", new BigDecimal("80.50"), Category.NINTENDO,"https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcQsGlyiTuk6eIHOgPi9wPvwi2DgUhwNNg5lZv6O4tVRP_0gWwHZ0CmATj0y6gVYrb1kiaYI4biUo2_Vof2p9HDF67yWmKJSviuDgtlxvvLr&usqp=CAE.jpg"),
                new Item("Need for Speed Heat", new BigDecimal("70.99"), Category.PC, "https://a.allegroimg.com/original/11cd60/8f0236ee4997812aafa2198c2dc1/PC-Need-for-Speed-Heat-Polska-Okladka.jpg"),
                new Item("NBA 2K23", new BigDecimal("79.99"), Category.NINTENDO, "https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcTuCcx2sM9Fej9qgq6DUidccTwDIz4RCHp36Lk5cijvO9PoCN7Qgwzezh12gWfv7sXbsdtI1J4ppiMJpl-UI5nIt2xR3NXWSpIqAbqJyj1A2_2z3I8D-dzJVA&usqp=CAE.jpg"),
                new Item("Re-Reckoning", new BigDecimal("35.60"), Category.XBOX, "https://a.allegroimg.com/s400/11e1d4/cdb7b1694701a0d343a39f7d8390/KINGDOMS-OF-AMALUR-RECKONING-GRA-XBOX-360.jpg")
        ));
    }
}
