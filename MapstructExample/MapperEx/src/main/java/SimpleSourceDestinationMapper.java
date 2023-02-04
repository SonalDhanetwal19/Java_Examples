import org.mapstruct.Mapper;

@Mapper
public interface SimpleSourceDestinationMapper {
        SimpleDestination sourceToDestination(SimpleSource simpleSource);
        SimpleSource destinationToSource(SimpleDestination simpleDestination);
}
