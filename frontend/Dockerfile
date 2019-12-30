FROM node:10.18 as build-deps
WORKDIR /app
COPY . ./
RUN yarn
RUN yarn build
