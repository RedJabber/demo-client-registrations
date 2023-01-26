# Core for online coding challenge
- We have a kind of event.
- We have clients.
- We need register clients to events.
- no security (_bonus_)

## Common schema
 ![](/docs/images/client-registrations.png)

## Clients domain
We need clients with complete **REST-full** managements.
We need correct layers segregation.

- We need register client to event.
- We need comment the registration.
- We need unregister client.(no history/audit)
- Api is documented (`org.springdoc:springdoc-openapi-ui:1.6.2`).
- Api is tested.

## Events domain
The only one event.

## Extras

- DB is bonus if `docker` is installed.
- Migration is extra bonus.
