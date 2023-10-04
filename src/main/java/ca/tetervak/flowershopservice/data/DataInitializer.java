package ca.tetervak.flowershopservice.data;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {

    private final FlowerDataRepository flowerDataRepository;

    public DataInitializer(FlowerDataRepository flowerDataRepository) {
        this.flowerDataRepository = flowerDataRepository;
    }

    @PostConstruct
    public void init(){

        Flower aster = new Flower(
                "aster",
                "Asters",
                2.99,
                "The name Aster comes from the Ancient Greek word meaning star, referring to the shape of the flower head.",
                "aster.jpeg",
                "https://en.wikipedia.org/wiki/Aster_(genus)"
        );
        flowerDataRepository.save(aster);

        Flower carnation = new Flower(
                "carnation",
                "Carnations",
                1.99,
                "Carnations require well-drained, neutral to slightly alkaline soil, and full sun. Examples include Gina Porto, Helen and Red Rocket",
                "carnation.jpeg",
                "https://en.wikipedia.org/wiki/Dianthus_caryophyllus"
        );
        flowerDataRepository.save(carnation);

        Flower daffodil = new Flower(
                "daffodil",
                "Daffodils",
                1.99,
                "Daffodil is a common English name, sometimes used for all varieties, and commonly used by the American Daffodil Society",
                "daffodil.jpeg",
                "https://en.wikipedia.org/wiki/Narcissus_(plant)"
        );
        flowerDataRepository.save(daffodil);

        Flower rose = new Flower(
                "rose",
                "Roses",
                4.99,
                "A rose is a woody perennial within the family Rosaceae. They form a group of erect shrubs, and climbing or trailing plants.",
                "rose.jpeg",
                "https://en.wikipedia.org/wiki/Rose"
        );
        flowerDataRepository.save(rose);

        Flower orchid = new Flower(
                "orchid",
                "Orchids",
                10.99,
                "The orchid family is a diverse and widespread family in the order Asparagales. It is one of the largest families of flowering plants.",
                "orchid.jpeg",
                "https://en.wikipedia.org/wiki/Orchidaceae"
        );
        flowerDataRepository.save(orchid);
    }
}
