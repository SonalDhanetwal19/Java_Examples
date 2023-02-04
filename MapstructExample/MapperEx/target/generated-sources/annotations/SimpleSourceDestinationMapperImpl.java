
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-21T14:55:40+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.15 (Oracle Corporation)"
)
public class SimpleSourceDestinationMapperImpl implements SimpleSourceDestinationMapper {

    @Override
    public SimpleDestination sourceToDestination(SimpleSource simpleSource) {
        if ( simpleSource == null ) {
            return null;
        }

        SimpleDestination simpleDestination = new SimpleDestination();

        return simpleDestination;
    }

    @Override
    public SimpleSource destinationToSource(SimpleDestination simpleDestination) {
        if ( simpleDestination == null ) {
            return null;
        }

        SimpleSource simpleSource = new SimpleSource();

        return simpleSource;
    }
}
