package com.gomo.SpringBoot.with.GitHub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/")
public class HomeController {


    @GetMapping
    @ResponseBody
    public String getHome() {
        return
        """
    <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <meta name="description" content="Automated CI/CD Pipeline with GitHub Actions, Docker Hub & Render">
                    <meta name="author" content="Dev16">

                    <link rel="icon" href="https://cdn.jsdelivr.net/npm/simple-icons@v9/icons/githubactions.svg" type="image/svg+xml">
                    <title>Automated CI/CD Pipeline | Dev16</title>

                    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
                    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">

                    <style>
                        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap');

                        body {
                            font-family: 'Poppins', sans-serif;
                            background: linear-gradient(135deg, #0f2027 0%, #203a43 50%, #2c5364 100%);
                            min-height: 100vh;
                            display: flex;
                            align-items: center;
                            justify-content: center;
                            padding: 20px;
                            color: #333;
                        }

                        .notification-card {
                            background: rgba(255, 255, 255, 0.97);
                            border-radius: 20px;
                            box-shadow: 0 20px 40px rgba(0, 0, 0, 0.25);
                            padding: 30px;
                            max-width: 1000px;
                            width: 100%;
                            text-align: center;
                            backdrop-filter: blur(10px);
                            border: 1px solid rgba(255, 255, 255, 0.4);
                            transform: translateY(0);
                            transition: transform 0.3s ease, box-shadow 0.3s ease;
                            position: relative;
                        }

                        .notification-card:hover {
                            transform: translateY(-5px);
                            box-shadow: 0 25px 50px rgba(0, 0, 0, 0.35);
                        }

                        .status-badge {
                            display: inline-flex;
                            align-items: center;
                            background: linear-gradient(135deg, #007bff 0%, #00c6ff 100%);
                            color: white;
                            padding: 10px 25px;
                            border-radius: 50px;
                            font-weight: 700;
                            margin-bottom: 20px;
                            box-shadow: 0 8px 20px rgba(0, 123, 255, 0.4);
                            text-transform: uppercase;
                            letter-spacing: 1px;
                            font-size: 16px;
                        }

                        .ci-icon {
                            font-size: 22px;
                            margin-right: 10px;
                        }

                        h2 {
                            color: #2c3e50;
                            font-weight: 800;
                            margin-bottom: 20px;
                            font-size: 28px;
                        }

                        .description {
                            color: #555;
                            font-size: 16px;
                            line-height: 1.6;
                            margin-bottom: 25px;
                        }

                        .pipeline-container {
                            background: rgba(245, 247, 250, 0.8);
                            border-radius: 16px;
                            padding: 20px;
                            margin: 25px 0;
                            box-shadow: inset 0 2px 10px rgba(0, 0, 0, 0.05);
                            position: relative;
                        }

                        .pipeline-title {
                            font-weight: 700;
                            color: #2c3e50;
                            margin-bottom: 15px;
                            font-size: 18px;
                        }

                        .pipeline-flow {
                            display: flex;
                            justify-content: center;
                            align-items: center;
                            flex-wrap: wrap;
                            position: relative;
                        }

                        .pipeline-step {
                            display: flex;
                            flex-direction: column;
                            align-items: center;
                            margin: 0 10px;
                            position: relative;
                            z-index: 2;
                            flex: 1;
                            max-width: 140px;
                        }

                        .step-icon-container {
                            width: 60px;
                            height: 60px;
                            border-radius: 50%;
                            display: flex;
                            align-items: center;
                            justify-content: center;
                            font-size: 24px;
                            background: white;
                            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.15);
                            margin-bottom: 12px;
                            position: relative;
                            transition: all 0.3s ease;
                        }

                        .pipeline-step:hover .step-icon-container {
                            transform: scale(1.1);
                            box-shadow: 0 12px 25px rgba(0, 0, 0, 0.2);
                        }

                        .step-1 .step-icon-container {
                            color: #28a745;
                            background: linear-gradient(135deg, #e8f5e9 0%, #ffffff 100%);
                            border: 2px solid #28a745;
                        }

                        .step-2 .step-icon-container {
                            color: #2088ff;
                            background: linear-gradient(135deg, #e6f0ff 0%, #ffffff 100%);
                            border: 2px solid #2088ff;
                        }

                        .step-3 .step-icon-container {
                            color: #0db7ed;
                            background: linear-gradient(135deg, #e6f7ff 0%, #ffffff 100%);
                            border: 2px solid #0db7ed;
                        }

                        .step-4 .step-icon-container {
                            color: #764ba2;
                            background: linear-gradient(135deg, #f5eeff 0%, #ffffff 100%);
                            border: 2px solid #764ba2;
                        }

                        .step-label {
                            font-weight: 600;
                            color: #444;
                            font-size: 13px;
                            margin-bottom: 6px;
                        }

                        .step-description {
                            color: #666;
                            font-size: 11px;
                            text-align: center;
                            line-height: 1.4;
                        }

                        .step-arrow {
                            font-size: 20px;
                            color: #7e8c9a;
                            margin: 0 3px;
                        }

                        .pipeline-line {
                            position: absolute;
                            top: 30px;
                            left: 70px;
                            right: 70px;
                            height: 4px;
                            background: linear-gradient(90deg, #28a745, #2088ff, #0db7ed, #764ba2);
                            z-index: 1;
                            border-radius: 2px;
                        }

                        .dev-info {
                            margin: 20px 0;
                            padding: 12px;
                            background: rgba(245, 247, 250, 0.8);
                            border-radius: 12px;
                            font-weight: 600;
                            color: #4a5568;
                            font-size: 14px;
                        }

                        .dev-info strong {
                            color: #2c3e50;
                        }

                        .links {
                            display: flex;
                            justify-content: center;
                            gap: 15px;
                            margin-top: 25px;
                        }

                        .btn {
                            padding: 12px 28px;
                            border-radius: 50px;
                            font-weight: 600;
                            text-decoration: none;
                            display: inline-flex;
                            align-items: center;
                            transition: all 0.3s ease;
                            font-size: 14px;
                        }

                        .btn-blog {
                            background: linear-gradient(135deg, #6a11cb 0%, #2575fc 100%);
                            color: white;
                            box-shadow: 0 5px 15px rgba(38, 117, 252, 0.4);
                        }

                        .btn i {
                            margin-right: 8px;
                            font-size: 16px;
                        }

                        .btn:hover {
                            transform: translateY(-3px);
                            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.3);
                        }

                        .pulse {
                            animation: pulse 2s infinite;
                        }

                        @keyframes pulse {
                            0% {
                                box-shadow: 0 0 0 0 rgba(0, 123, 255, 0.7);
                            }
                            70% {
                                box-shadow: 0 0 0 12px rgba(0, 123, 255, 0);
                            }
                            100% {
                                box-shadow: 0 0 0 0 rgba(0, 123, 255, 0);
                            }
                        }

                        @media (max-width: 992px) {
                            .pipeline-step {
                                margin: 0 5px;
                                max-width: 120px;
                            }

                            .step-icon-container {
                                width: 50px;
                                height: 50px;
                                font-size: 20px;
                            }

                            .step-label {
                                font-size: 12px;
                            }

                            .step-description {
                                font-size: 10px;
                            }

                            .pipeline-line {
                                left: 60px;
                                right: 60px;
                            }
                        }

                        @media (max-width: 768px) {
                            .pipeline-flow {
                                flex-direction: column;
                            }

                            .pipeline-step {
                                margin: 15px 0;
                                max-width: 100%;
                            }

                            .step-arrow {
                                transform: rotate(90deg);
                                margin: 10px 0;
                            }

                            .pipeline-line {
                                display: none;
                            }

                            .links {
                                flex-direction: column;
                                align-items: center;
                            }
                        }
                    </style>
                </head>
                <body>
                    <div class="notification-card">
                        <div class="status-badge pulse">
                            <i class="ci-icon fas fa-bolt"></i>
                            CI/CD  Implementation
                        </div>

                        <h2>Automated Deployment Pipeline</h2>
                        <p class="description">
                            Our fully automated CI/CD pipeline builds Docker images with GitHub Actions,
                            pushes to Docker Hub, and deploys automatically to Render.
                        </p>

                        <div class="pipeline-container">
                            <div class="pipeline-title">Deployment Workflow</div>
                            <div class="pipeline-flow">
                                <div class="pipeline-line"></div>

                                <div class="pipeline-step step-1">
                                    <div class="step-icon-container">
                                        <i class="fas fa-code"></i>
                                    </div>
                                    <div class="step-label">Code Build app.jar </div>
                                    <div class="step-description">Application code compilation</div>
                                </div>

                                <div class="step-arrow">
                                    <i class="fas fa-arrow-right"></i>
                                </div>

                                <div class="pipeline-step step-2">
                                    <div class="step-icon-container">
                                        <img src="https://cdn.jsdelivr.net/npm/simple-icons@v9/icons/githubactions.svg" width="26" height="26" />
                                    </div>
                                    <a href="https://github.com/moneshgomo"><div class="step-label">GitHub Actions</div></a>
                                    <div class="step-description">Triggers on push to main branch</div>
                                </div>

                                <div class="step-arrow">
                                    <i class="fas fa-arrow-right"></i>
                                </div>

                                <div class="pipeline-step step-3">
                                    <div class="step-icon-container">
                                        <i class="fab fa-docker"></i>
                                    </div>
                                    <a href="https://hub.docker.com/repository/docker/moneshgomo">
                                    <div class="step-label">Docker Hub</div></a>
                                    <div class="step-description">Image built and pushed to registry</div>
                                </div>

                                <div class="step-arrow">
                                    <i class="fas fa-arrow-right"></i>
                                </div>

                                <div class="pipeline-step step-4">
                                    <div class="step-icon-container">
                                        <i class="fas fa-cloud-upload-alt"></i>
                                    </div>
                                    <div class="step-label">Auto Deploy</div>
                                    <div class="step-description">Render pulls and deploys latest image</div>
                                </div>
                            </div>
                        </div>

                        <div class="dev-info">
                            <p>Developed by <strong>Dev16</strong> |  Automated CI/CD Pipeline</p>
                        </div>

                        <div class="links">
                            <a href="https://dev16-blog.web.app" class="btn btn-blog"><i class="fas fa-blog"></i> Visit Blog</a>
                        </div>
                    </div>

                    <script>
                        document.addEventListener("DOMContentLoaded", () => {
                            const card = document.querySelector('.notification-card');
                            card.addEventListener('mouseenter', () => card.classList.remove('pulse'));
                            card.addEventListener('mouseleave', () => card.classList.add('pulse'));
                        });
                    </script>
                </body>
                </html>
                """;
    }

}
