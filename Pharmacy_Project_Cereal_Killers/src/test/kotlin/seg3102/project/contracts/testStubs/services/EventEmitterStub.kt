package seg3102.project.contracts.testStubs.services

import seg3102.project.application.services.DomainEventEmitter
import seg3102.project.domain.common.DomainEvent

class EventEmitterStub : DomainEventEmitter{
    private val emitted: MutableList<DomainEvent> = ArrayList()

    override fun emit(event: DomainEvent) {
        emitted.add(event)
    }

}