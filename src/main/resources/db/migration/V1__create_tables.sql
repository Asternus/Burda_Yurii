create table if not exists equipment
(
    device_id    bigserial PRIMARY KEY,
    manufacturer varchar(255),
    type         varchar(255)
);

create table if not exists internet
(
    Internet_id bigserial PRIMARY KEY,
    traffic     bigint
);

create table if not exists tariffs
(
    tariff_id    bigserial PRIMARY KEY,
    tariff_name  varchar(255),
    tariff_price bigint
);

create table if not exists subscribers
(
    user_id        bigserial PRIMARY KEY,
    name           varchar(255),
    surname        varchar(255),
    phone_number   varchar(255),
    gender         varchar(255),
    device_id      bigint,
    tariff_id      bigint,
    count_messages bigint,
    count_call     bigint,
    count_internet bigint

);

create table if not exists call
(
    call_id      bigserial PRIMARY KEY,
    sender_id    bigint,
    recipient_id bigint
);

create table if not exists messages
(
    messages_id  bigserial PRIMARY KEY,
    text         varchar(255),
    sender_id    bigint,
    recipient_id bigint
)