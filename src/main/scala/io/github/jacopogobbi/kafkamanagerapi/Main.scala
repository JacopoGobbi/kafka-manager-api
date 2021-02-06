package io.github.jacopogobbi.kafkamanagerapi

import cats.effect.{ExitCode, IO, IOApp}

object Main extends IOApp {
  def run(args: List[String]): IO[ExitCode] =
    KafkamanagerapiServer.stream[IO].compile.drain.as(ExitCode.Success)
}
