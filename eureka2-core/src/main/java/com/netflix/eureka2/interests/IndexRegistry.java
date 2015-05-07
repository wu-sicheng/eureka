package com.netflix.eureka2.interests;

import com.netflix.eureka2.registry.SourcedEurekaRegistry;
import rx.Observable;

/**
 * @author Nitesh Kant
 */
public interface IndexRegistry<T> {

    Observable<ChangeNotification<T>> forInterest(Interest<T> interest,
                                                  Observable<ChangeNotification<T>> dataSource,
                                                  Index.InitStateHolder<T> initStateHolder);

    Observable<ChangeNotification<T>> forCompositeInterest(MultipleInterests<T> interest, SourcedEurekaRegistry<T> registry);

    Observable<Void> shutdown();

    Observable<Void> shutdown(Throwable cause);
}