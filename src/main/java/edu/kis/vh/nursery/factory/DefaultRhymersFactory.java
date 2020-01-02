package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
/**
 * Klasa tworzy konkretne obiekty klas dzidziczących z DefaultCountingOutRhymer
 */
public class DefaultRhymersFactory implements Rhymersfactory {
    /**
     * @return zwraca nowy obiekt klasy DefaultCountingOutRhymer
     */
    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }
    /**
     * @return zwraca nowy obiekt klasy DefaultCountingOutRhymer
     */
    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }
    /**
     * @return zwraca nowy obiekt klasy FIFORhymer
     */
    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }
    /**
     * @return zwraca nowy obiekt klasy HanoiRhymer
     */
    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}